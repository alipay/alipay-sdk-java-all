package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChannelRuleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.channel.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-05 14:41:44
 */
public class DatadigitalFincloudFinsaasChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3717525315384934832L;

	/** 
	 * 渠道code+唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("channel_code")
	private String channelCode;

	/** 
	 * 渠道简介+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("channel_desc")
	private String channelDesc;

	/** 
	 * 渠道名称+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("channel_name")
	private String channelName;

	/** 
	 * 渠道规则+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("channel_rule")
	private ChannelRuleDTO channelRule;

	/** 
	 * 渠道使用范围+不唯一+获取渠道详情+（COMMON-通用、ASSIGN-指定租户）从数据库获取
	 */
	@ApiField("channel_scope")
	private String channelScope;

	/** 
	 * 渠道状态+唯一+获取渠道详情+（ENABLE-启用、DISABLE-停用）+从数据库获取
	 */
	@ApiField("channel_status")
	private String channelStatus;

	/** 
	 * 渠道模板+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("channel_template")
	private String channelTemplate;

	/** 
	 * 渠道租户code+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("channel_tenant_code")
	private String channelTenantCode;

	/** 
	 * 渠道类型+不唯一+获取渠道详情+（EMAIL-邮件、MESSAGE-短信、PUSH-推送、AD-广告）+从数据库获取
	 */
	@ApiField("channel_type")
	private String channelType;

	/** 
	 * 创建时间+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 修改时间+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 渠道id+唯一+获取获取详情+数据库
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 渠道图片+不唯一+获取渠道详情+从数据库获取
	 */
	@ApiField("pic_url")
	private String picUrl;

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getChannelCode( ) {
		return this.channelCode;
	}

	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}
	public String getChannelDesc( ) {
		return this.channelDesc;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelName( ) {
		return this.channelName;
	}

	public void setChannelRule(ChannelRuleDTO channelRule) {
		this.channelRule = channelRule;
	}
	public ChannelRuleDTO getChannelRule( ) {
		return this.channelRule;
	}

	public void setChannelScope(String channelScope) {
		this.channelScope = channelScope;
	}
	public String getChannelScope( ) {
		return this.channelScope;
	}

	public void setChannelStatus(String channelStatus) {
		this.channelStatus = channelStatus;
	}
	public String getChannelStatus( ) {
		return this.channelStatus;
	}

	public void setChannelTemplate(String channelTemplate) {
		this.channelTemplate = channelTemplate;
	}
	public String getChannelTemplate( ) {
		return this.channelTemplate;
	}

	public void setChannelTenantCode(String channelTenantCode) {
		this.channelTenantCode = channelTenantCode;
	}
	public String getChannelTenantCode( ) {
		return this.channelTenantCode;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getChannelType( ) {
		return this.channelType;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicUrl( ) {
		return this.picUrl;
	}

}
