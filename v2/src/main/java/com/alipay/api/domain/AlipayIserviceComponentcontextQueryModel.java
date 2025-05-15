package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务过程中的组件上下文信息	
 *
 * @author auto create
 * @since 1.0, 2024-05-29 15:28:05
 */
public class AlipayIserviceComponentcontextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8383726697119921412L;

	/**
	 * 一通服务的唯一ID，在服务拉起时，由方舟自动生成或者由渠道传入
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 查找的源组件code，方舟为插件颁发的唯一code
	 */
	@ApiField("source_component_code")
	private String sourceComponentCode;

	/**
	 * 查找的目标组件的code，方舟颁发给插件的唯一code
	 */
	@ApiField("target_component_code")
	private String targetComponentCode;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSourceComponentCode() {
		return this.sourceComponentCode;
	}
	public void setSourceComponentCode(String sourceComponentCode) {
		this.sourceComponentCode = sourceComponentCode;
	}

	public String getTargetComponentCode() {
		return this.targetComponentCode;
	}
	public void setTargetComponentCode(String targetComponentCode) {
		this.targetComponentCode = targetComponentCode;
	}

}
