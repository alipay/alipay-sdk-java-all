package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大模型返回卡片数据结构
 *
 * @author auto create
 * @since 1.0, 2024-08-15 12:07:16
 */
public class CardDataInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6444516598678276651L;

	/**
	 * 可空，是卡片当前链接的支付宝侧id——如科室id，医生id
	 */
	@ApiField("card_data_id")
	private String cardDataId;

	/**
	 * 卡片额外信息补充
	 */
	@ApiListField("card_ext_info")
	@ApiField("card_ext_info_d_t_o")
	private List<CardExtInfoDTO> cardExtInfo;

	/**
	 * 用于补充描述地址之类的
	 */
	@ApiField("card_introduce")
	private String cardIntroduce;

	/**
	 * 暂时不需要考虑，用于后续拓展
	 */
	@ApiListField("card_key_words")
	@ApiField("string")
	private List<String> cardKeyWords;

	/**
	 * 卡片等级
	 */
	@ApiField("card_level")
	private String cardLevel;

	/**
	 * 卡片单条数据logo链接
	 */
	@ApiField("card_logo")
	private String cardLogo;

	/**
	 * 卡片单条数据的名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡片标题
	 */
	@ApiField("card_title")
	private String cardTitle;

	/**
	 * 卡片中跳转链接
	 */
	@ApiField("card_url")
	private String cardUrl;

	/**
	 * 卡片中数据展示顺序，从0开始，0的优先级最高
	 */
	@ApiField("index")
	private String index;

	/**
	 * 父卡片id
	 */
	@ApiField("parent_card_id")
	private String parentCardId;

	/**
	 * 父卡片名称
	 */
	@ApiField("parent_card_name")
	private String parentCardName;

	public String getCardDataId() {
		return this.cardDataId;
	}
	public void setCardDataId(String cardDataId) {
		this.cardDataId = cardDataId;
	}

	public List<CardExtInfoDTO> getCardExtInfo() {
		return this.cardExtInfo;
	}
	public void setCardExtInfo(List<CardExtInfoDTO> cardExtInfo) {
		this.cardExtInfo = cardExtInfo;
	}

	public String getCardIntroduce() {
		return this.cardIntroduce;
	}
	public void setCardIntroduce(String cardIntroduce) {
		this.cardIntroduce = cardIntroduce;
	}

	public List<String> getCardKeyWords() {
		return this.cardKeyWords;
	}
	public void setCardKeyWords(List<String> cardKeyWords) {
		this.cardKeyWords = cardKeyWords;
	}

	public String getCardLevel() {
		return this.cardLevel;
	}
	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}

	public String getCardLogo() {
		return this.cardLogo;
	}
	public void setCardLogo(String cardLogo) {
		this.cardLogo = cardLogo;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardTitle() {
		return this.cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardUrl() {
		return this.cardUrl;
	}
	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getParentCardId() {
		return this.parentCardId;
	}
	public void setParentCardId(String parentCardId) {
		this.parentCardId = parentCardId;
	}

	public String getParentCardName() {
		return this.parentCardName;
	}
	public void setParentCardName(String parentCardName) {
		this.parentCardName = parentCardName;
	}

}
