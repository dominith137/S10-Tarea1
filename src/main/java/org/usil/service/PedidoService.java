package org.usil.service;

import org.usil.model.Pedido;
import org.usil.model.Producto;

public class PedidoService {
    
    private static int contadorPedidos = 1;

    public boolean registrarPedido(Pedido pedido) {
        // Actualizar el stock del producto
        Producto producto = pedido.getProducto();
        int stockActual = producto.getStock();
        int cantidadPedida = pedido.getCantidad();
        producto.setStock(stockActual - cantidadPedida);

        return true;
    }

    public String generarNumeroPedido() {
        return "PED-" + String.format("%06d", contadorPedidos++);
    }
}

