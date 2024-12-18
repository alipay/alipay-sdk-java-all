package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.questionnare.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipaySocialQuestionnareTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7554468692553637718L;

	/** 
	 * 投放渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/** 
	 * 接入方式{1:SDK；2:体验检测；3:页面到达;4:页面停留;5:页面返回;6:页面折返;7:用户操作行为}
	 */
	@ApiField("collection_type")
	private String collectionType;

	/** 
	 * 业务扩展信息JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 结束时间
	 */
	@ApiField("gmt_terminate")
	private String gmtTerminate;

	/** 
	 * 内灰比例
	 */
	@ApiField("gray_percent")
	private String grayPercent;

	/** 
	 * 交互模式
	 */
	@ApiField("interact_type")
	private String interactType;

	/** 
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

	/** 
	 * 问卷状态
	 */
	@ApiField("qstn_status")
	private String qstnStatus;

	/** 
	 * uone问卷id
	 */
	@ApiField("rmt_qstn_id")
	private String rmtQstnId;

	/** 
	 * 问卷URL
	 */
	@ApiField("rmt_qstn_url")
	private String rmtQstnUrl;

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getChannelType( ) {
		return this.channelType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}
	public String getCollectionType( ) {
		return this.collectionType;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGmtTerminate(String gmtTerminate) {
		this.gmtTerminate = gmtTerminate;
	}
	public String getGmtTerminate( ) {
		return this.gmtTerminate;
	}

	public void setGrayPercent(String grayPercent) {
		this.grayPercent = grayPercent;
	}
	public String getGrayPercent( ) {
		return this.grayPercent;
	}

	public void setInteractType(String interactType) {
		this.interactType = interactType;
	}
	public String getInteractType( ) {
		return this.interactType;
	}

	public void setQstnId(String qstnId) {
		this.qstnId = qstnId;
	}
	public String getQstnId( ) {
		return this.qstnId;
	}

	public void setQstnStatus(String qstnStatus) {
		this.qstnStatus = qstnStatus;
	}
	public String getQstnStatus( ) {
		return this.qstnStatus;
	}

	public void setRmtQstnId(String rmtQstnId) {
		this.rmtQstnId = rmtQstnId;
	}
	public String getRmtQstnId( ) {
		return this.rmtQstnId;
	}

	public void setRmtQstnUrl(String rmtQstnUrl) {
		this.rmtQstnUrl = rmtQstnUrl;
	}
	public String getRmtQstnUrl( ) {
		return this.rmtQstnUrl;
	}

}
