package com.wanda.credit.ds.dao.domain.zhongshunew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.GenericGenerator;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wanda.credit.base.domain.BaseDomain;
@Entity(name="ZS_N_Corp_Mortgagecan")
@Table(name = "t_ds_zs_new_corp_mortgagecan")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer","order","id","updated","created","updatedby","createdby"})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@XStreamAlias("alter")
public class ZS_Corp_Mortgagecan  extends BaseDomain {
	private static final long serialVersionUID = 1L;
	private String  Id;
	private ZS_Order	ORDER   ;	
	private String  MAB_REGNO   ; // 登记编号
	private String	MAB_CAN_DATE; // 注销日期
	private String	MAB_CAN_RES ; // 注销原因
	/**
	 * 获取 主键
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REFID")
	public ZS_Order getORDER() {
		return ORDER;
	}
	public void setORDER(ZS_Order oRDER) {
		ORDER = oRDER;
	}
	public String getMAB_REGNO() {
		return MAB_REGNO;
	}
	public void setMAB_REGNO(String mAB_REGNO) {
		MAB_REGNO = mAB_REGNO;
	}
	public String getMAB_CAN_DATE() {
		return MAB_CAN_DATE;
	}
	public void setMAB_CAN_DATE(String mAB_CAN_DATE) {
		MAB_CAN_DATE = mAB_CAN_DATE;
	}
	public String getMAB_CAN_RES() {
		return MAB_CAN_RES;
	}
	public void setMAB_CAN_RES(String mAB_CAN_RES) {
		MAB_CAN_RES = mAB_CAN_RES;
	}
}
