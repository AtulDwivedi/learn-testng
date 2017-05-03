package com.atuldwivedi.testng.beginner;

import java.util.Map;

import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;
import org.testng.collections.Maps;

public class AssertionExtn extends Assertion {

	private final Map<AssertionError, IAssert> m_errors;

	public AssertionExtn()
	{
		this.m_errors = Maps.newLinkedHashMap();
	}

	protected void doAssert(IAssert a) {
		onBeforeAssert(a);
		try {
			a.doAssert();
			onAssertSuccess(a);
		} catch (AssertionError ex) {
			onAssertFailure(a, ex);
			this.m_errors.put(ex, a);
		} finally {
			onAfterAssert(a);
		}
	}

	public void assertAll() {
		if (!(this.m_errors.isEmpty())) {
			StringBuilder sb = new StringBuilder("Total assertion failed: "+m_errors.size());
			sb.append("\n\t");
			sb.append("The following asserts failed:");
			boolean first = true;
			for (Map.Entry ae : this.m_errors.entrySet()) {
				if (first)
					first = false;
				else {
					sb.append(",");
				}
				sb.append("\n\t");
				sb.append(((AssertionError)ae.getKey()).getMessage());
			}
			throw new AssertionError(sb.toString());
		}
	}
}
