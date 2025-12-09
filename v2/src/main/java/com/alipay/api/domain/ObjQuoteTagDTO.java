package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行情标签模型
 *
 * @author auto create
 * @since 1.0, 2025-10-10 17:22:47
 */
public class ObjQuoteTagDTO extends AlipayObject {

	private static final long serialVersionUID = 4127172474249899938L;

	/**
	 * 标的物id
	 */
	@ApiField("obj_id")
	private String objId;

	/**
	 * 标签列表
	 */
	@ApiListField("tags")
	@ApiField("quote_tag_d_t_o")
	private List<QuoteTagDTO> tags;

	public String getObjId() {
		return this.objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}

	public List<QuoteTagDTO> getTags() {
		return this.tags;
	}
	public void setTags(List<QuoteTagDTO> tags) {
		this.tags = tags;
	}

}
