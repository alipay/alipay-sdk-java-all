package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺外部数据同步
 *
 * @author auto create
 * @since 1.0, 2023-03-01 21:53:11
 */
public class KoubeiShopExternalDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4447677477695783347L;

	/**
	 * 操作类型：Bind:建立口碑门店和饿了么外卖关系
unBind：解除口碑门店和饿了么外卖关系
sync：同步门店营业时间、营业状态、店铺状态
	 */
	@ApiField("action")
	private String action;

	/**
	 * shop_status:OPEN（生效）||CLOSE（失效） ，饿了么签约状态
business_time：08：00-11：30,13：00-20：30，营业时间，多个逗号分隔
business_status：OPEN（营业）||CLOSE（歇业）  饿了么营业状态。
ext_info：map结构, 记录bindType-绑定类型: ELE_LEADS(饿了么leads开店)、KB_ELE_OPEN_SHOP_ONLINE(口碑在线开饿了么门店)、KB_ELE_BIND_ONLINE(口碑接饿了么在线修改绑定关系)、ELE_ALGO_CALC(饿了么算法计算)、ELE_OPERATION(饿了么运营操作); bindRelation-绑定关系:STRONG(强)、WEAK(弱)
	 */
	@ApiField("content")
	private String content;

	/**
	 * 数据来源。固定值:elm
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 数据版本（时间戳）。用于判断请求是否乱序。
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 外部的门店id
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 口碑店铺Id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getExternalShopId() {
		return this.externalShopId;
	}
	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
