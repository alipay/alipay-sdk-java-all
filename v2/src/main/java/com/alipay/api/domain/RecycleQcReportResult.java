package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户质检结果
 *
 * @author auto create
 * @since 1.0, 2025-09-23 14:02:40
 */
public class RecycleQcReportResult extends AlipayObject {

	private static final long serialVersionUID = 3727683191896993831L;

	/**
	 * null
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * option_code是问卷中的问题选项code，和text二选一传入
使用支付宝问卷问题时，传入option_code；非支付宝问卷，传入text
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 文案
	 */
	@ApiField("text")
	private String text;

	public List<String> getImageIdList() {
		return this.imageIdList;
	}
	public void setImageIdList(List<String> imageIdList) {
		this.imageIdList = imageIdList;
	}

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
