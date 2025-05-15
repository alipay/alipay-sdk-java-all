package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 画像分析数据含人群显著标签列表
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:03:52
 */
public class PortraitsDataTgiVO extends AlipayObject {

	private static final long serialVersionUID = 7656696752632963169L;

	/**
	 * 画像分析数据
	 */
	@ApiListField("portraits")
	@ApiField("portrait_data_v_o")
	private List<PortraitDataVO> portraits;

	/**
	 * 人群显著标签列表
	 */
	@ApiField("top_tgi_tags")
	private TgiTagVO topTgiTags;

	public List<PortraitDataVO> getPortraits() {
		return this.portraits;
	}
	public void setPortraits(List<PortraitDataVO> portraits) {
		this.portraits = portraits;
	}

	public TgiTagVO getTopTgiTags() {
		return this.topTgiTags;
	}
	public void setTopTgiTags(TgiTagVO topTgiTags) {
		this.topTgiTags = topTgiTags;
	}

}
