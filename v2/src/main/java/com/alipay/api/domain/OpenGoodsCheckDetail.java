package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 控货校验结果详情
 *
 * @author auto create
 * @since 1.0, 2024-05-31 16:46:20
 */
public class OpenGoodsCheckDetail extends AlipayObject {

	private static final long serialVersionUID = 1244444583299397525L;

	/**
	 * 控货子项的校验结果，true：通过，false：不通过
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	/**
	 * 校验code，唯一标识一项控货校验规则
	 */
	@ApiField("code")
	private String code;

	/**
	 * 控货文案
	 */
	@ApiField("detail_text")
	private String detailText;

	public Boolean getCheckResult() {
		return this.checkResult;
	}
	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDetailText() {
		return this.detailText;
	}
	public void setDetailText(String detailText) {
		this.detailText = detailText;
	}

}
