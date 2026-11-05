public class refactorizacion
{
	static public void main(String argv[])
	{
		boolean disponible = true;
		
		// actividad 1
		if (disponible)
			System.out.println("Disponible");
		// actividad 2
		boolean	activo = false;
		if (!activo)
			System.out.println("Inactivo");
		// actividad 3
		boolean	autorizado = true;
		if (autorizado)
			System.out.println("OK");
		// actividad 4
		int	edad = 17;
		if (edad < 18)
			System.out.println("Menor");
		// actividad 5
		edad = 20;
		boolean	tieneCarnet = false;
		if (edad < 18 && !tieneCarnet)
			System.out.println("No puede conducir");
		// actividad 6
		int	dia = 6;
		if (dia != 6 && dia != 7)
			System.out.println("Laborable");
		// actividad 7
		if (activo)
			System.out.println("Activo");
		// actividad 8
		boolean conectado = true;
		if (conectado && !conectado)
			System.out.println("A");
		// NO SE PUEDE EJECUTARSE ESTE BLOQUE ES IMPOSIBLE
		// actividad 9
		boolean visible = true;
		if (visible || !visible)
			System.out.println("A");
		// Siempre se activa porque un boolean visible lo es o no lo es 
		// actividad 10
		boolean admin = true;
		boolean mantenimiento = true;
		if (admin)
			System.out.println("A");
		// actividad 11
		edad = 18;
		boolean socio = false;
		boolean	invitado = true;
		if (edad >= 18 && (socio || invitado))
			System.out.println("Acceso");
		// actividad 12
		int	temperatura = 5;
		if (temperatura < 10 || temperatura > 30)
			System.out.println("Fuera de rango");
		// actividad 13
		edad = 21;
		if (edad >= 21)
			System.out.println("Acceso");
		// actividad 14
		int	nota = 5;
		if (nota < 7)
			System.out.println("Nivel bajo");
		// actividad 15
		int puntos = 0;
		if (puntos < 50)
			System.out.println("Bajo");
		else if (puntos < 80)
			System.out.println("Medio");
		else
			System.out.println("Alto");
		
		// actividad 16
		boolean	usuarioCorrecto = true;
		boolean claveCorrecta = true;
		if (usuarioCorrecto && claveCorrecta)
			System.out.println("Acceso");
		// actividad 17
		/* 
		if (objeto != null &&  objeto.estadoActivo())
			System.out.println("Activo");
		*/
		// El orden es imporante porque primero estamos comprobando que el objeto exista antes de llamar a la funcion miembro.
		
		// actividad 18
		edad = 20;
		boolean carnet = true;
		activo = true;
		if (edad <= 18 && carnet && activo)
			System.out.println("Puede conducir");
	}
}