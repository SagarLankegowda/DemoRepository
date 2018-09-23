$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/WorkSpaceSeleniumSelf/Ecommerce/src/main/java/Featured/ExcelDriveLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "login-action;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Create the Excel Workbook \"TestData.xlsx\" and create the test data",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I Login to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "ExcelDriveLoginImpln.User_is_already_on_login_page()"
});
formatter.result({
  "duration": 20996244490,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestData.xlsx",
      "offset": 29
    }
  ],
  "location": "ExcelDriveLoginImpln.I_Create_the_Excel_Workbook_and_create_the_test_data(String)"
});
formatter.result({
  "duration": 3920667498,
  "status": "passed"
});
formatter.match({
  "location": "ExcelDriveLoginImpln.I_Login_to_the_application()"
});
formatter.result({
  "duration": 9734008390,
  "status": "passed"
});
});