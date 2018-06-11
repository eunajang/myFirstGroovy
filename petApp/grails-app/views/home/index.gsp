<html>
<head>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'pet.label', default: 'Pet')}" />
    <title>Pet Store</title>
</head>
<body>
  <a href="#show-pet" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
  <div class="nav" role="navigation">
      <ul>
          <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
          <li><a class="list" href="${createLink(uri: '/pet/index')}"><g:message code="default.list.label" args="[entityName]" /></a></li>
          <li><a class="create" href="${createLink(uri: '/pet/create')}"><g:message code="default.new.label" args="[entityName]" /></a></li>
      </ul>
  </div>
<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome ${name}!</h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>

        <p>There are ${petTotal} vehicles in the database.</p>

          <table>
              <g:each in="${petList}" var="pet">

                    <g:link controller="pet" action="show" id="${pet.id}">
                    <tr>
                      ${pet.name} - ${pet.age}, ${pet.species.name}, ${pet.breed.name}, ${pet.color}<br/>
                    </tr>
                    </g:link>

            </g:each>
          </table>


        <g:form action="updateName" style="margin: 0 auto; width:320px">
           <g:textField name="name" value="Type Your Pet's Name" placeholder="${name}"/>
           <g:submitButton name="User Name" />
       </g:form>
    </section>
</div>

</body>
</html>
