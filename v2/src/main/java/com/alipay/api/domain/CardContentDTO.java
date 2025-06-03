package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡片内容
 *
 * @author auto create
 * @since 1.0, 2024-10-10 19:18:28
 */
public class CardContentDTO extends AlipayObject {

	private static final long serialVersionUID = 7691289369887559427L;

	/**
	 * 卡片列表
	 */
	@ApiListField("card_list")
	@ApiField("card_unit")
	private List<CardUnit> cardList;

	/**
	 * 扩展数据
	 */
	@ApiField("ext_info")
	private String extInfo;

	public List<CardUnit> getCardList() {
		return this.cardList;
	}
	public void setCardList(List<CardUnit> cardList) {
		this.cardList = cardList;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
