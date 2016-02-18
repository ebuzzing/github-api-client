package tv.teads.github.api.model.webhook

import io.circe.generic.semiauto._

import tv.teads.github.api.model._

trait DeploymentPayloadCodec {
  self: UserCodec with RepositoryCodec with TeamCodec ⇒

  implicit lazy val deploymentPayloadDecoder = deriveDecoder[DeploymentPayload]
}
case class DeploymentPayload(
  team:         Team,
  repository:   Repository,
  organization: Option[User],
  sender:       User
) extends Payload
