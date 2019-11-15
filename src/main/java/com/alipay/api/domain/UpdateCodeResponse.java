package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新码值的返回结果
 *
 * @author auto create
 * @since 1.0, 2019-11-14 17:28:38
 */
public class UpdateCodeResponse extends AlipayObject {

	private static final long serialVersionUID = 3175384175959639152L;

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
