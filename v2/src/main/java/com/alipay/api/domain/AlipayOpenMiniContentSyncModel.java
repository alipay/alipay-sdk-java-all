package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序内容接入
 *
 * @author auto create
 * @since 1.0, 2021-08-12 18:51:04
 */
public class AlipayOpenMiniContentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2741426272317425535L;

	/**
	 * 具体的内容数据，采用json格式，不同类型不同操作数据不同，请根据 https://opendocs.alipay.com/mini/00ntj5内容同步产品文档，选择需接入功能并传入对应参数。
	 */
	@ApiField("content_data")
	private String contentData;

	/**
	 * 内容类型，例如门店、商品等。枚举支持：
ITEM：导入、更新、下架商品时使用。
SHOP：门店解除绑定时使用。
SERVICE：服务绑定、解绑分门店/POI、分页查询绑定关系时使用。
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 扩展信息，json格式。请根据 https://opendocs.alipay.com/mini/00ntj5内容同步产品文档，选择需接入功能并传入对应参数。
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 内容类型下的具体操作，比如门店类型下，小程序批量绑定门店。枚举支持：
sync：导入或更新商品时使用。
invalid：下架商品时使用。
batchUnbind：解绑门店时使用。
batchBind：小程序服务绑定绑定门店/POI时使用。
batchUnbinding：小程序服务解绑门店/POI时使用。
pageQueryBindingInfo：分页查询小程序服务绑定门店/POI关系时使用。
详情可参考https://opendocs.alipay.com/mini/00ntj5内容同步产品文档。
	 */
	@ApiField("operation")
	private String operation;

	public String getContentData() {
		return this.contentData;
	}
	public void setContentData(String contentData) {
		this.contentData = contentData;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}
