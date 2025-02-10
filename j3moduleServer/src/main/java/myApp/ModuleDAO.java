package myApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ModuleDAO {
	
	instance;
	
	private Map<Integer, Module> modules = new HashMap<Integer, Module>();
	
	private ModuleDAO() {
		
		Module m1 = new Module();
		m1.setId(1);
		m1.setName("Databases");
		m1.setLecturer("AB");
		m1.setHoursPerWeek(14);
		modules.put(1, m1);
		
		Module m2 = new Module(2, "Maths", "CD", 8);
		modules.put(2, m2);
		
		Module m3 = new Module(3, "Project", "EF", 40);
		modules.put(3, m3);
	}
	
	public List<Module> getModules(){
//		List<Module> modules = new ArrayList<Module>();
//		modules.addAll(moduleMap.values());
//		return modules;
		return new ArrayList<Module>(modules.values());
	}
	
	public Module getModule(int id) {
		return modules.get(id);
	}

}
