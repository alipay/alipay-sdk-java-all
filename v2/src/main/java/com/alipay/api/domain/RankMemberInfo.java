package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 榜单成员信息
 *
 * @author auto create
 * @since 1.0, 2023-09-15 10:40:32
 */
public class RankMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 6667678432362629385L;

	/**
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 排行榜成员名称如：中国
	 */
	@ApiField("member_name")
	private String memberName;

	/**
	 * 外部成员ID
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 排行值
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * W、D、L分别是 胜、平、负
GS代表进球
GA 代表失球
sortRank 代表排序
total 代表奖牌总数
GD代表净胜球
P代表是积分
gold代表金牌
silver代表银牌
bronze代表铜牌
	 */
	@ApiField("rank_detail")
	private String rankDetail;

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMemberName() {
		return this.memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRankDetail() {
		return this.rankDetail;
	}
	public void setRankDetail(String rankDetail) {
		this.rankDetail = rankDetail;
	}

}
