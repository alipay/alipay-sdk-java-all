package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询广告投放实体
 *
 * @author auto create
 * @since 1.0, 2025-10-09 12:35:39
 */
public class AlipayDataDataserviceAdentitylibraryServiceentityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3234757765164984827L;

	/**
	 * 当前页的页码
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 灯火定义的营销目标对应的code值
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 每页返回的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家的id，用于唯一标识一个商家
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 商品所属的小程序appId
	 */
	@ApiField("service_entity_app_id")
	private String serviceEntityAppId;

	/**
	 * 用于表示实体来源
	 */
	@ApiField("service_entity_out_source")
	private String serviceEntityOutSource;

	/**
	 * 标识实体的类型，可以是电商商品、金融商品、保险服务三种类型
	 */
	@ApiField("service_entity_type")
	private String serviceEntityType;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getServiceEntityAppId() {
		return this.serviceEntityAppId;
	}
	public void setServiceEntityAppId(String serviceEntityAppId) {
		this.serviceEntityAppId = serviceEntityAppId;
	}

	public String getServiceEntityOutSource() {
		return this.serviceEntityOutSource;
	}
	public void setServiceEntityOutSource(String serviceEntityOutSource) {
		this.serviceEntityOutSource = serviceEntityOutSource;
	}

	public String getServiceEntityType() {
		return this.serviceEntityType;
	}
	public void setServiceEntityType(String serviceEntityType) {
		this.serviceEntityType = serviceEntityType;
	}

}
