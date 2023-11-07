package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署组件信息
 *
 * @author auto create
 * @since 1.0, 2023-10-08 10:57:54
 */
public class SealTabsVO extends AlipayObject {

	private static final long serialVersionUID = 1644471378691372295L;

	/**
	 * fileId关联标注哪一个文件
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 是否全局关键字。默认false：第【pageNumber】页 第【kwIndex】个关键字；true：查询 全文本第【kwIndex】个【keyword】用印
	 */
	@ApiField("global_key_word")
	private Boolean globalKeyWord;

	/**
	 * 签署位置关键字 关键字模式必传
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 签署关键字索引，默认第【pageNumber】页 第【kwIndex】个关键字
	 */
	@ApiField("kw_index")
	private Long kwIndex;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 签署人位置识别类型：关键字签字||绝对坐标签字
	 */
	@ApiField("seal_type")
	private String sealType;

	/**
	 * 签署组件类型
	 */
	@ApiField("tab_type")
	private String tabType;

	/**
	 * textTabs初始话文本内容
	 */
	@ApiField("text_tab_value")
	private String textTabValue;

	/**
	 * 坐标用印x轴位置
	 */
	@ApiField("x_position")
	private Long xPosition;

	/**
	 * 坐标用印y轴位置
	 */
	@ApiField("y_position")
	private Long yPosition;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Boolean getGlobalKeyWord() {
		return this.globalKeyWord;
	}
	public void setGlobalKeyWord(Boolean globalKeyWord) {
		this.globalKeyWord = globalKeyWord;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getKwIndex() {
		return this.kwIndex;
	}
	public void setKwIndex(Long kwIndex) {
		this.kwIndex = kwIndex;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getSealType() {
		return this.sealType;
	}
	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getTabType() {
		return this.tabType;
	}
	public void setTabType(String tabType) {
		this.tabType = tabType;
	}

	public String getTextTabValue() {
		return this.textTabValue;
	}
	public void setTextTabValue(String textTabValue) {
		this.textTabValue = textTabValue;
	}

	public Long getxPosition() {
		return this.xPosition;
	}
	public void setxPosition(Long xPosition) {
		this.xPosition = xPosition;
	}

	public Long getyPosition() {
		return this.yPosition;
	}
	public void setyPosition(Long yPosition) {
		this.yPosition = yPosition;
	}

}
