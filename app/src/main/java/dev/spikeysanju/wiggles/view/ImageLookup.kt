package dev.spikeysanju.wiggles.view

import dev.spikeysanju.wiggles.R
import dev.spikeysanju.wiggles.model.Image

private val images = mapOf(
    Image.RED_DOG to R.drawable.red_dog,
    Image.ORANGE_DOG to R.drawable.orange_dog,
    Image.YELLOW_DOG to R.drawable.yellow_dog,
    Image.BLUE_DOG to R.drawable.blue_dog,
    Image.WHITE_DOG to R.drawable.white_dog,
    Image.DOG_OWNER to R.drawable.owner
)

fun lookupImageResource(image: Image) : Int = images[image]!!