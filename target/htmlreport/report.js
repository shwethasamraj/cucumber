$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/datatable.feature");
formatter.feature({
  "name": "search multiple item",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user searches",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "travel kit"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "datatable.user_searches(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify",
  "keyword": "And "
});
formatter.match({
  "location": "datatable.verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close",
  "keyword": "Then "
});
formatter.match({
  "location": "datatable.close()"
});
formatter.result({
  "status": "passed"
});
});