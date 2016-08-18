<!DOCTYPE HTML>

<html>
    <head>
        <title>Retrospect by TEMPLATED</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/cadastro.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
        
    
    </head>
    
    <body>
        

        <form action="cadastro" method="post">





            <!-- DADOS DE CADASTRO -->

            <table cellspacing="10">
                <tr>
                    <td>
                        <label for="email">E-mail </label>
                    </td>
                    <td align="left">
                        <input type="text" name="email">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for="nome">Nome </label>
                    </td>
                    <td align="left">
                        <input type="text" name="nome">
                    </td>
                </tr>


                <tr>
                    <td>
                        <label for="sobrenome">Sobrenome</label>
                    </td>
                    <td align="left">
                        <input type="text" name="sobrenome">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for="nickname">Nickname</label>
                    </td>
                    <td align="left">
                        <input type="text" name="nickname">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for="pass">Senha </label>
                    </td>
                    <td align="left">
                        <input type="password" name="senha">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for="passconfirm">Confirme senha </label>  <!-- Criar código .js-->
                    </td>
                    <td align="left">
                        <input type="password" name="passconfirm">
                    </td>
                </tr>   
            </table>

            <br/>

            <input type="submit" Value="Enviar">
            <br><br>
            <input type="reset" value="Limpar">
            <br><br>
           
        </form>
    </body>
</html>