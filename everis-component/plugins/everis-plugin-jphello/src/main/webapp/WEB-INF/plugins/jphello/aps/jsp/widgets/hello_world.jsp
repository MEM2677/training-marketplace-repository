<%@ taglib prefix="wp" uri="/aps-core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h3>Hello world widget(Draft)</h3>
<h3>Here is an example on how to link an internal page in a widget</h3>
<br/>
Link to a page whose code is aaaa known in advance:&nbsp;<a href="<wp:url page="target" />" >Home</a>
<br/>
Link to a page where a known widget (the widget API) is deployed:&nbsp;
<wp:pageWithWidget widgetTypeCode="entando_apis" var="pageVar"/>
<a href="<wp:url page="${pageVar.code}" />" >${pageVar.titles.get("en")}</a>

<br/>
<br/>
The tags below are used to include elements to style a Widget (CSS, generic resources and images)
<br/>
<br/>
&lt;wp:cssURL&gt;&nbsp;points to&nbsp;<wp:cssURL />
<br/>
&lt;wp:resourceURL&gt;&nbsp;points to&nbsp;<wp:resourceURL />
<br/>
&lt;wp:imgURL&gt;&nbsp;points to&nbsp;<wp:imgURL />
<br/>
