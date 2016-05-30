$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Sample feature file",
  "description": "",
  "id": "sample-feature-file",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "First sceanrio",
  "description": "",
  "id": "sample-feature-file;first-sceanrio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ": This is my first step",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ": This is my second step",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ": This is my third step",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.first_step()"
});
formatter.result({
  "duration": 122480021,
  "status": "passed"
});
formatter.match({
  "location": "Steps.second_step()"
});
formatter.result({
  "duration": 98116,
  "status": "passed"
});
formatter.match({
  "location": "Steps.third_step()"
});
formatter.result({
  "duration": 185970,
  "status": "passed"
});
});