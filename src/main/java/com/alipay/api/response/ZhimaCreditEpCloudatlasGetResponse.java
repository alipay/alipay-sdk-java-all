package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Edge;
import com.alipay.api.domain.Vertex;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.cloudatlas.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpCloudatlasGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5316681965388329547L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 边表列表，字段说明参考数据结构说明
	 */
	@ApiListField("edges")
	@ApiField("edge")
	private List<Edge> edges;

	/** 
	 * 点表列表，字段说明参考数据结构说明
	 */
	@ApiListField("vertexs")
	@ApiField("vertex")
	private List<Vertex> vertexs;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	public List<Edge> getEdges( ) {
		return this.edges;
	}

	public void setVertexs(List<Vertex> vertexs) {
		this.vertexs = vertexs;
	}
	public List<Vertex> getVertexs( ) {
		return this.vertexs;
	}

}
