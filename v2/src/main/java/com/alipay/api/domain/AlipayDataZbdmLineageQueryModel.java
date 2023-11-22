package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询蚂蚁数据平台的元数据血缘信息
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:18:07
 */
public class AlipayDataZbdmLineageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8535933637495889117L;

	/**
	 * 参数名：血缘传播方向
应用场景：血缘探索的方向，forward-正向；backward-反向
如何获取：业务传入
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 参数名：血缘传播的边类型
应用场景：表涉及的边类型为：["table_depend_table"]
字段涉及的边类型为：["field_depend_field","field_influ_field"]
如何获取：
业务方传入
	 */
	@ApiListField("edge_type")
	@ApiField("string")
	private List<String> edgeType;

	/**
	 * 参数名：血缘探索的最大深度
应用场景：血缘探索的最大深度，超过最大深度将终止探索
如何获取：业务方传入，默认可以是20
	 */
	@ApiField("max_depth")
	private Long maxDepth;

	/**
	 * 参数名: 表或者字段的guid集合
应用场景：输入要查询的表或者字段的guid
如何获取：业务方传入-表：odps.projectname.tablename;字段：odps.projectname.tablename.fieldname
	 */
	@ApiListField("start_ids")
	@ApiField("string")
	private List<String> startIds;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public List<String> getEdgeType() {
		return this.edgeType;
	}
	public void setEdgeType(List<String> edgeType) {
		this.edgeType = edgeType;
	}

	public Long getMaxDepth() {
		return this.maxDepth;
	}
	public void setMaxDepth(Long maxDepth) {
		this.maxDepth = maxDepth;
	}

	public List<String> getStartIds() {
		return this.startIds;
	}
	public void setStartIds(List<String> startIds) {
		this.startIds = startIds;
	}

}
