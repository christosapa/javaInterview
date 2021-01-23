
<#import "/spring.ftl" as spring />
<html>
<head>
    <#include "partials/head.ftlh">
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <#include "partials/sidebar.ftlh">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h3 class="mb-3">User</h3>
  <#if user?has_content>
  <input class="form-control" id="myInput" type="text" placeholder="Search..">
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Surname</th>
                        <th>Email</th>
                        <th>Company</th>
                        <th>TelephoneNumber</th>
                    </tr>
                    </thead>

                </table>
            </div>
      <#else>
        No users found!
      </#if>
        </main>
    </div>
</div>
</body>
</html>