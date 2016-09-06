<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="hibernatePersistence.usuario.Usuario" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Retrospect by TEMPLATED</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/perfil.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->

        <%
            Usuario usuario = (Usuario) session.getAttribute("email");
            String nome = usuario.getNome();
        %>
    </head>
    <body class="landing">

        <!-- Header -->
        <header id="header" class="alt">
            <h1><a href="index.html">Postbud</a></h1>
                
                    Olá, <%=nome%>
                     
                    <a href="index.jsp" class="button big special">Sair</a>
                
        </header>
                    
        <!-- Nav 
        <nav id="nav">
            <ul class="links">
                <li><a href="index.html">Home</a></li>
                <li><a href="cadastro.jsp">Cadastro</a></li>
                <li><a href="elements.html">Elements</a></li>
            </ul>
        </nav> -->

        <!-- Banner -->
        <section id="banner">

            <h1>Olá, <%=nome%></h1>


        </section>

        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
        <script src="assets/js/main.js"></script>

    </body>
</html>