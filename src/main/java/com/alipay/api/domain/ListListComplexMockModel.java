package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 复杂对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ListListComplexMockModel extends AlipayObject {

	private static final long serialVersionUID = 6231377814197439912L;

	/**
	 * 复杂对象list
	 */
	@ApiListField("cm_list")
	@ApiField("complext_mock_model")
	private List<ComplextMockModel> cmList;

	public List<ComplextMockModel> getCmList() {
		return this.cmList;
	}
	public void setCmList(List<ComplextMockModel> cmList) {
		this.cmList = cmList;
	}

}
