package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreativeStyle;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.style.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-13 16:13:15
 */
public class AlipayDigitalopUcdpApecreativeStyleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7856217747412217335L;

	/** 
	 * 查询出的风格id和风格mock
	 */
	@ApiListField("creative_styles")
	@ApiField("creative_style")
	private List<CreativeStyle> creativeStyles;

	public void setCreativeStyles(List<CreativeStyle> creativeStyles) {
		this.creativeStyles = creativeStyles;
	}
	public List<CreativeStyle> getCreativeStyles( ) {
		return this.creativeStyles;
	}

}
