package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存查询任务结果
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:51
 */
public class AlipayCommerceTransportAdStocktaskresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8394629278522698515L;

	/**
	 * 广告主id + 库存结果查询前校验该任务是否属于该广告主
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 库存查询任务id + 根据库存查询任务id获得库存结果
	 */
	@ApiField("task_id")
	private Long taskId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
