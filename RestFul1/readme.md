<h1 align="center">RESTful API</h1>
<ol>
	<li>App config file is same, no change at all, but leave viewResolver and resource handling</li>
	<li>The only change is to replace <strong>@Controller</strong> with <strong>@RestController</strong></li>
	<li>Add dependency of jackson data binding so that spring will automatically convert POJO to json data</li>
</ol>