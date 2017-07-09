/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function finduser() {
    var valor = $("#filtro").val();

    $.ajax(
            {
                type: 'POST',
                dataType: 'text',
                url: "MostrarUsuarioController",
                data: {
                    value: valor
                }
                
            }
    );


}
