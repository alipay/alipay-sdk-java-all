package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RedisInstanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.redis.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:13
 */
public class AlipayCloudCloudbaseRedisInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7348439678844739594L;

	/** 
	 * 实例列表
	 */
	@ApiListField("instances")
	@ApiField("redis_instance_info")
	private List<RedisInstanceInfo> instances;

	public void setInstances(List<RedisInstanceInfo> instances) {
		this.instances = instances;
	}
	public List<RedisInstanceInfo> getInstances( ) {
		return this.instances;
	}

}
