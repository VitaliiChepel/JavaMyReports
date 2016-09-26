package epam.regex.controller;

    public interface RegularExpressions {
        String regExpName = "[A-Za-z]+";
        String regExpNickName = "[A-Za-z0-9_]{4,20}+$";
        String regExpComment = "[A-Za-z0-9.,-()/*+]";
        String regExpGroup = "[PG1|PG2|PG3|PG4|PG5]";
        String regExpHomePhone = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
        String regExpMobilePhone  = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
        String regExpSecondMobilePhone = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
        String regExpEmail = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{3,5}\\b";
        String regExpSkype = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{4,25}";
        String regExpIndex = "[0-9]{5}";
        String regExpCity = "[a-zA-z]+";
        String regExpStreet = "[a-zA-z]+";
        String regExpBuilding = "[0-9a-z]+";
        String regExpApartment = "[0-9]+";
        String regExpCreationNoteDate = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        String regExplastChangeDate = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";

    }


