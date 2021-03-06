package com.evseevoleg.spring.mvc_hibernate.controller;

import com.evseevoleg.spring.mvc_hibernate.entity.Document;
import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;
import com.evseevoleg.spring.mvc_hibernate.entity.People;
import com.evseevoleg.spring.mvc_hibernate.service.InformationDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * обрабатывает запрос пользователя, создаёт соответствующую
 * Модель и передаёт её для отображения в view
 */
@Controller
public class MyController {
    @Autowired
    private ValidationWork validationWork;
    @Autowired
    private InformationDocumentService informationDocumentService;


    /**
     * @return стартовая страница
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showFirstView() {

        return "first-view";
    }


    /**
     * сохранение человека
     *
//     * @param request позволяет получить информацию, запрошенную клиентом
     * @return страница формы заполнения
     */
    @RequestMapping("/addDetailsPeople")
    public String addNewPeople(HttpServletRequest request, Model model) {
        People people = new People(request.getParameter("peopleName"),
                request.getParameter("lastName"),
                request.getParameter("patronymic"),
                request.getParameter("birthday"),
                request.getParameter("sex"));


        InformationDocument informationDocumentPas = validationWork.changeInformationDocumentParam(
                request.getParameter("seriesPas"), request.getParameter("numberPas"),
                request.getParameter("datePas"), people, new Document("Паспорт")
        );

        InformationDocument informationDocumentSNILS = validationWork.changeInformationDocumentParam(
                request.getParameter("seriesSnils"), request.getParameter("numberSnils"),
                request.getParameter("dateSnils"), people, new Document("СНИЛС")
        );

        InformationDocument informationDocumentINN = validationWork.changeInformationDocumentParam(
                request.getParameter("seriesInn"), request.getParameter("numberInn"),
                request.getParameter("dateInn"), people, new Document("ИНН")
        );

        InformationDocument informationDocumentVod = validationWork.changeInformationDocumentParam(
                request.getParameter("seriesPrav"), request.getParameter("numberPrav"),
                request.getParameter("datePrav"), people, new Document("Водительское удостоверение")
        );

        InformationDocument informationDocumentPrip = validationWork.changeInformationDocumentParam(
                request.getParameter("seriesPrip"), request.getParameter("numberPrip"),
                request.getParameter("datePrip"), people, new Document("Приписное свидетельство")
        );

        InformationDocument informationDocumentVoen = validationWork.changeInformationDocumentParam(
                request.getParameter("seriesVoen"), request.getParameter("numberVoen"),
                request.getParameter("dateVoen"), people, new Document("Военный билет")
        );

        model.addAttribute("InfoDoc", informationDocumentPas);
        model.addAttribute("InfoDoc", informationDocumentSNILS);
        model.addAttribute("InfoDoc", informationDocumentINN);
        model.addAttribute("InfoDoc", informationDocumentVod);
        model.addAttribute("InfoDoc", informationDocumentPrip);
        model.addAttribute("InfoDoc", informationDocumentVoen);
        return "add-people";
    }


    @RequestMapping("/savePeople")
    public String savePeople(@ModelAttribute("InfoDoc") InformationDocument informationDocument) {
        informationDocumentService.saveInfDoc(informationDocument);
        return "redirect:allPeople";
    }


    /**
     * выводит всех зарегистрированных на
     * экран
     *
     * @param model модель
     * @return стартовая страница
     */
    @RequestMapping(value = "/allPeople", method = RequestMethod.GET)
    public String showAllEmployees(Model model) {
        ValidationWork validationWork = new ValidationWork();
        List<InformationDocument> allInfoDocument = informationDocumentService.getAllInfoDocument();
        List<People> peopleList = new ArrayList<>();
        for (InformationDocument informationDocument : allInfoDocument) {
            peopleList.add(informationDocument.getPeople());
        }
        model.addAttribute("allEmps", validationWork.formPeopleShow(peopleList));

        return "all-employees";
    }
}
