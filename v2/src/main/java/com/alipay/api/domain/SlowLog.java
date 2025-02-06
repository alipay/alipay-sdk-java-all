package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 慢日志详情
 *
 * @author auto create
 * @since 1.0, 2024-05-28 11:33:25
 */
public class SlowLog extends AlipayObject {

	private static final long serialVersionUID = 7391227218199829563L;

	/**
	 * 客户端IP
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 数据库集合名称
	 */
	@ApiField("collection_name")
	private String collectionName;

	/**
	 * 耗时(毫秒)
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 执行时间
	 */
	@ApiField("execute_time")
	private String executeTime;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * mongoDB的社区版的原生语法，key代表字段或者关键字，value代表值:例如
   {
     $addFields: {
       totalHomework: { $sum: "$homework" } ,
       totalQuiz: { $sum: "$quiz" }
     }
   }
	 */
	@ApiField("request_body")
	private String requestBody;

	/**
	 * 执行结果返回行数
	 */
	@ApiField("row_count")
	private String rowCount;

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getCollectionName() {
		return this.collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public Long getCost() {
		return this.cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

	public String getExecuteTime() {
		return this.executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getRequestBody() {
		return this.requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getRowCount() {
		return this.rowCount;
	}
	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}

}
