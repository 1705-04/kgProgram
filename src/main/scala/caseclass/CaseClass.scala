package caseclass

import common.GlobalCountans


/**
    * Created by tian on 2018/5/3.
    */
  case class IPRule(var startIP: Long, var endIP: Long, var country: String, var province: String, var city: String) extends Serializable
  case class RegionInfo(var country: String=GlobalCountans.DEFALUT_VALUE, var province: String=GlobalCountans.DEFALUT_VALUE, var city: String=GlobalCountans.DEFALUT_VALUE) extends Serializable

