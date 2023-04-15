package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微动效数据
 *
 * @author auto create
 * @since 1.0, 2020-10-16 16:24:51
 */
public class SingleDynamicData extends AlipayObject {

	private static final long serialVersionUID = 2691991723768525664L;

	/**
	 * 过期时间，单位为秒
	 */
	@ApiField("expire")
	private Long expire;

	/**
	 * key-value格式的透传参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 优先级，一个用户同一个appid有多个动效时，优先显示优先级高的
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 业务状态唯一性标识
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public Long getExpire() {
		return this.expire;
	}
	public void setExpire(Long expire) {
		this.expire = expire;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
