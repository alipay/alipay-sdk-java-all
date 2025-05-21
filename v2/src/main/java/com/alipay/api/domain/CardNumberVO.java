package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户持有的福卡数量模型
 *
 * @author auto create
 * @since 1.0, 2022-12-07 18:01:05
 */
public class CardNumberVO extends AlipayObject {

	private static final long serialVersionUID = 2314216994799224138L;

	/**
	 * 福卡模板ID，即福卡类型
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 用户持有该类型的福卡数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 福卡名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 卡槽小图彩色
	 */
	@ApiField("pi_url")
	private String piUrl;

	/**
	 * 卡槽小图灰色
	 */
	@ApiField("pi_url_dis")
	private String piUrlDis;

	/**
	 * 默认选中的福卡数量
	 */
	@ApiField("selected_count")
	private Long selectedCount;

	/**
	 * 卡槽序列
	 */
	@ApiField("serial")
	private Long serial;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPiUrl() {
		return this.piUrl;
	}
	public void setPiUrl(String piUrl) {
		this.piUrl = piUrl;
	}

	public String getPiUrlDis() {
		return this.piUrlDis;
	}
	public void setPiUrlDis(String piUrlDis) {
		this.piUrlDis = piUrlDis;
	}

	public Long getSelectedCount() {
		return this.selectedCount;
	}
	public void setSelectedCount(Long selectedCount) {
		this.selectedCount = selectedCount;
	}

	public Long getSerial() {
		return this.serial;
	}
	public void setSerial(Long serial) {
		this.serial = serial;
	}

}
