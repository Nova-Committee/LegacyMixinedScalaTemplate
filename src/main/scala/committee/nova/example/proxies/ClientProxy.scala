package committee.nova.example.proxies

import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

class ClientProxy extends CommonProxy {
  override def preInit(event: FMLPreInitializationEvent): Unit = super.preInit(event)

  override def init(event: FMLInitializationEvent): Unit = super.init(event)

  override def postInit(event: FMLPostInitializationEvent): Unit = super.postInit(event);
}
