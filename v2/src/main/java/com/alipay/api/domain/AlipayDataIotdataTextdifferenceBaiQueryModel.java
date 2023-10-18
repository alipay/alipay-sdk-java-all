package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本差异可视化接口
 *
 * @author auto create
 * @since 1.0, 2019-08-22 17:31:37
 */
public class AlipayDataIotdataTextdifferenceBaiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1348683399465771724L;

	/**
	 * 文档的文本内容。
	 */
	@ApiField("text_s")
	private String textS;

	/**
	 * 文档文本
	 */
	@ApiField("text_t")
	private String textT;

	public String getTextS() {
		return this.textS;
	}
	public void setTextS(String textS) {
		this.textS = textS;
	}

	public String getTextT() {
		return this.textT;
	}
	public void setTextT(String textT) {
		this.textT = textT;
	}

}
