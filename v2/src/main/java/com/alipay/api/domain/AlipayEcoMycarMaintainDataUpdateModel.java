package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保养数据变更通知
 *
 * @author auto create
 * @since 1.0, 2021-12-06 11:05:50
 */
public class AlipayEcoMycarMaintainDataUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1431669211274593384L;

	/**
	 * 门店或者服务的编码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 事件类型(1:上下线 2:服务价格)
	 */
	@ApiField("event_id")
	private Long eventId;

	/**
	 * 来源(1:汽车超人)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 类型(1:门店 2:服务)
	 */
	@ApiField("type_id")
	private String typeId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getEventId() {
		return this.eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTypeId() {
		return this.typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}
