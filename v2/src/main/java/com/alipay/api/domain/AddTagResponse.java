package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 打标返回值
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:32
 */
public class AddTagResponse extends AlipayObject {

	private static final long serialVersionUID = 8463455748628573191L;

	/**
	 * 批量打标接口返回值
	 */
	@ApiListField("add_tag_result")
	@ApiField("add_tag_result")
	private List<AddTagResult> addTagResult;

	public List<AddTagResult> getAddTagResult() {
		return this.addTagResult;
	}
	public void setAddTagResult(List<AddTagResult> addTagResult) {
		this.addTagResult = addTagResult;
	}

}
