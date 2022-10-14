package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新码值的返回结果
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:37
 */
public class UpdateCodeResponse extends AlipayObject {

	private static final long serialVersionUID = 6354845696769888972L;

	/**
	 * 批量更新码值返回结果列表
	 */
	@ApiListField("update_code_result")
	@ApiField("update_code_result")
	private List<UpdateCodeResult> updateCodeResult;

	public List<UpdateCodeResult> getUpdateCodeResult() {
		return this.updateCodeResult;
	}
	public void setUpdateCodeResult(List<UpdateCodeResult> updateCodeResult) {
		this.updateCodeResult = updateCodeResult;
	}

}
