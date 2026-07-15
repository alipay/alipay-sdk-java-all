package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正文章信息
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:00:38
 */
public class CaSystemMainBody extends AlipayObject {

	private static final long serialVersionUID = 4378599732237596765L;

	/**
	 * 只有自动签署时支持加盖日期组件
	 */
	@ApiField("date_tabs")
	private DateTabs dateTabs;

	/**
	 * 关键字，mainBodyModel为KEY_WORD时必填
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 关键字类型，mainBodyModel为KEY_WORD时必填（1-当前页；2-所有页）
	 */
	@ApiField("key_word_type")
	private Long keyWordType;

	/**
	 * 第几个关键字，mainBodyModel为KEY_WORD时必填
	 */
	@ApiField("kw_index")
	private Long kwIndex;

	/**
	 * x偏移量，单位点（point）
	 */
	@ApiField("kw_shift_x")
	private Long kwShiftX;

	/**
	 * y偏移量，单位点（point）
	 */
	@ApiField("kw_shift_y")
	private Long kwShiftY;

	/**
	 * 正文章模式
	 */
	@ApiField("main_body_model")
	private String mainBodyModel;

	/**
	 * 签署页码
	 */
	@ApiField("pos_page")
	private Long posPage;

	/**
	 * 签署区位置横坐标，mainBodyModel为ABSOLUTE_POSITION时必填，单位点（point）
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署区位置纵坐标，mainBodyModel为ABSOLUTE_POSITION时必填，单位点（point）
	 */
	@ApiField("pos_y")
	private Long posY;

	public DateTabs getDateTabs() {
		return this.dateTabs;
	}
	public void setDateTabs(DateTabs dateTabs) {
		this.dateTabs = dateTabs;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Long getKeyWordType() {
		return this.keyWordType;
	}
	public void setKeyWordType(Long keyWordType) {
		this.keyWordType = keyWordType;
	}

	public Long getKwIndex() {
		return this.kwIndex;
	}
	public void setKwIndex(Long kwIndex) {
		this.kwIndex = kwIndex;
	}

	public Long getKwShiftX() {
		return this.kwShiftX;
	}
	public void setKwShiftX(Long kwShiftX) {
		this.kwShiftX = kwShiftX;
	}

	public Long getKwShiftY() {
		return this.kwShiftY;
	}
	public void setKwShiftY(Long kwShiftY) {
		this.kwShiftY = kwShiftY;
	}

	public String getMainBodyModel() {
		return this.mainBodyModel;
	}
	public void setMainBodyModel(String mainBodyModel) {
		this.mainBodyModel = mainBodyModel;
	}

	public Long getPosPage() {
		return this.posPage;
	}
	public void setPosPage(Long posPage) {
		this.posPage = posPage;
	}

	public Long getPosX() {
		return this.posX;
	}
	public void setPosX(Long posX) {
		this.posX = posX;
	}

	public Long getPosY() {
		return this.posY;
	}
	public void setPosY(Long posY) {
		this.posY = posY;
	}

}
