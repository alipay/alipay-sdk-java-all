package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 响应对象
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:46
 */
public class FindTextResponse extends AlipayObject {

	private static final long serialVersionUID = 2339488474445112893L;

	/**
	 * null
	 */
	@ApiListField("text_list")
	@ApiField("find_text_d_t_o")
	private List<FindTextDTO> textList;

	public List<FindTextDTO> getTextList() {
		return this.textList;
	}
	public void setTextList(List<FindTextDTO> textList) {
		this.textList = textList;
	}

}
