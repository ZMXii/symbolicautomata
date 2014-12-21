package transducers.sst;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import theory.BooleanAlgebraSubst;

public class CharConstant<U, F, S> implements ConstantToken<U, F, S>{

	//This has to be made symbolic
	public S constant;

	public CharConstant(S constant) {
		super();
		this.constant = constant;
	}

	@Override
	public List<S> applyTo(VariableAssignment<S> assignment,
			Map<String, Integer> variablesToIndices, S input,
			BooleanAlgebraSubst<U, F, S> ba) {
		
		List<S> out = new LinkedList<S>(); 
		out.add(constant);
		return out;
	}
}