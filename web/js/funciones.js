$(document).ready(function () {
    
    listarVentas();
    listarSucursales();
    listarClientes();
    listarProductos();
    listarVendedor();
    
});
let xx;
function listarVentas() {
    
    
    $.get("Tablitauwu", {"opc": 1}, function (data) {
        
        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idventa + "</td><td>" + x[i].sucursal +                    
                    "</td><td>" + x[i].empleado + "</td><td>" + x[i].vendedor + "</td><td>" + x[i].fecha +
                    "</td><td></td><td><a href='xd'><i id='EYES'class='fa-solid fa-eye'></i></a></td>");
        }
        
    });
}
function listarSucursales() {
    $.get("SucursalesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {
            
            
            
            $("#sucursal").append($("<option>", {
                value: x[i],
                text: x[i].direccion
                        
            })
                    );
            
            
        }
        
    });
    
}
function listarClientes() {
    $.get("ClientesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {



            $("#clientes").append($("<option>", {
                value: x[i].idcliente,
                text: x[i].nombre
              

            })
                    );


        }

    });

}
function listarVendedor() {
    $.get("VendedorController", {"opc": 1}, function (data)
    {
        
        let x = JSON.parse(data);        
        for (let i = 0; i < x.length; i++) {



            $("#vendedor").append($("<option>", {
                value: x[i].idvendedor,
                text: x[i].nombres
              

            })
                    );


        }

    });

}




function listarProductos() {
    
    
    
    $.get("ProductosController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {
            
            
            
            $("#productos").append($("<option>", {
                value: x[i],
                text: x[i].nombre
                        
            })
                    );
            
            
        }
        
    });
    
}
let mostrar = () => {
    const valor = $("#productos :selected").val(),
            texto = $("#productos :selected").text();
    $('#productosP').val(texto);
};


$('#productos').change(mostrar);