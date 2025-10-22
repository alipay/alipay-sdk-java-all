package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.zbdm.lineage.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:50
 */
public class AlipayDataZbdmLineageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4295513456184235218L;

	/** 
	 * 参数名：返回血缘探索的边集合
应用场景：返回边的起始id，终止id已经反向
如何获取：geabase中获取
	 */
	@ApiListField("edges")
	@ApiField("string")
	private List<String> edges;

	/** 
	 * 参数名:返回血缘探索的点集合
应用场景:返回一张表/字段上下游20层以内的表/字段
如何获取：从geabase中获取
	 */
	@ApiListField("vertices")
	@ApiField("string")
	private List<String> vertices;

	public void setEdges(List<String> edges) {
		this.edges = edges;
	}
	public List<String> getEdges( ) {
		return this.edges;
	}

	public void setVertices(List<String> vertices) {
		this.vertices = vertices;
	}
	public List<String> getVertices( ) {
		return this.vertices;
	}

}
