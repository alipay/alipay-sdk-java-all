package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风格和布局和关联表的信息
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:24:58
 */
public class CreativeDesignInfo extends AlipayObject {

	private static final long serialVersionUID = 5311754719642933868L;

	/**
	 * 布局对应的风格信息
	 */
	@ApiListField("creative_design_relation_style_list")
	@ApiField("creative_design_relation_style")
	private List<CreativeDesignRelationStyle> creativeDesignRelationStyleList;

	/**
	 * designId，返回的布局id
	 */
	@ApiField("design_id")
	private String designId;

	/**
	 * 布局的背景图，唯一，返回图片的地址。
	 */
	@ApiField("mock_img")
	private String mockImg;

	public List<CreativeDesignRelationStyle> getCreativeDesignRelationStyleList() {
		return this.creativeDesignRelationStyleList;
	}
	public void setCreativeDesignRelationStyleList(List<CreativeDesignRelationStyle> creativeDesignRelationStyleList) {
		this.creativeDesignRelationStyleList = creativeDesignRelationStyleList;
	}

	public String getDesignId() {
		return this.designId;
	}
	public void setDesignId(String designId) {
		this.designId = designId;
	}

	public String getMockImg() {
		return this.mockImg;
	}
	public void setMockImg(String mockImg) {
		this.mockImg = mockImg;
	}

}
